<template>
	<view class="content">
		<view class="page">
			<swiper class="swiper" autoplay="true" interval="3000" duration="1000"  circular="true">
				<swiper-item v-for="imgurl in imgurls" v-key="index">
					<image :src="imgurl" mode="widthFix"></image>
				</swiper-item>
			</swiper>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				title: 'Hello',
				imgurls: ["https://szlsay-1301558572.cos.ap-beijing.myqcloud.com/emos/img/banner/swiper-1.jpg",
				"https://szlsay-1301558572.cos.ap-beijing.myqcloud.com/emos/img/banner/swiper-2.jpg",
				"https://szlsay-1301558572.cos.ap-beijing.myqcloud.com/emos/img/banner/swiper-3.jpg",
				"https://szlsay-1301558572.cos.ap-beijing.myqcloud.com/emos/img/banner/swiper-4.jpg",
				"https://szlsay-1301558572.cos.ap-beijing.myqcloud.com/emos/img/banner/swiper-5.jpg"]
			}
		},
		onLoad() {

		},
		methods: {

		}
	}
</script>

<style lang="less">
	@import url("index.less");
</style>
