<template>
	<view>
		<camera device-position="front" flash="off" class="camera" @error="error" v-if="showCamera"></camera>
		<image mode="widthFix" class="image" :src="photoPath" v-if="showImage"></image>
		<view class="operate-container">
			<button type="primary" class="btn" @tap="clickBtn" :disabled="!canCheckin">{{btnText}}</button>
			<button type="warn" class="btn" @tap="afresh" :disabled="!canCheckin">重拍</button>
		</view>
		<view class="notice-container">
			<text class="notice">注意事项</text>
			<text class="desc">拍照签到的时候，必须要拍摄自己的正面照片，侧面照片会导致无法识别。另外，拍照的时候不要戴墨镜或者帽子，避免影响拍照签到的准确度。</text>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				btnText: "拍照",
				canCheckin: true,
				photoPath: "",
				showImage: false,
				showCamera: true
			}
		},
		methods: {
			clickBtn() {
				let that = this;
				if (that.btnText == "拍照") {
					let ctx = uni.createCameraContext();
					ctx.takePhoto({
						quality: "high",
						success: function(resp) {
							console.log(resp.tempImagePath)
							that.photoPath = resp.tempImagePath
							that.showCamera = false
							that.showImage = true
							that.btnText = "签到"
						}
					})
				} else {
					//TODO 签到
					uni.showToast({
						title:"未开发"
					})
				}
			},
			afresh(){
				let that = this;
				that.showCamera = true;
				that.showImage = false;
				that.btnText = "拍照";
			}
		}
	}
</script>

<style lang="less">
	@import url("checkin.less");
</style>
