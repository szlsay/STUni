<template>
	<view class="content">
		<view class="page">
			<swiper class="swiper" autoplay="true" interval="3000" duration="1000" circular="true">
				<swiper-item v-for="(imgurl, index) in imgurls" :key="index">
					<image :src="imgurl" mode="widthFix"></image>
				</swiper-item>
			</swiper>
			<view class="notify-container" @tap="">
				<view class="notify-title">
					<image class="notify-icon" src="../../static/icon-1.png" mode="widthFix"></image>
					消息提醒
				</view>
				<view class="notify-content">
					你有{{unreadRows}}条未读消息
				</view>
				<image class="more-icon" src="../../static/icon-2.png" mode="widthFix"></image>
			</view>
			<view class="nav-container">
				<view class="nav-row">
					<view class="nav">
						<image src="../../static/nav-1.png" mode="widthFix" class="icon"></image>
						<text class="name">在线签到</text>
					</view>
					<view class="nav">
						<image src="../../static/nav-2.png" mode="widthFix" class="icon"></image>
						<text class="name">员工健康</text>
					</view>
					<view class="nav">
						<image src="../../static/nav-3.png" mode="widthFix" class="icon"></image>
						<text class="name">在线请假</text>
					</view>
					<view class="nav">
						<image src="../../static/nav-4.png" mode="widthFix" class="icon"></image>
						<text class="name">公务出差</text>
					</view>
				</view>
				<view class="nav-row">
					<view class="nav">
						<image src="../../static/nav-5.png" mode="widthFix" class="icon"></image>
						<text class="name">员工日报</text>
					</view>
					<view class="nav">
						<image src="../../static/nav-6.png" mode="widthFix" class="icon"></image>
						<text class="name">我的加班</text>
					</view>
					<view class="nav">
						<image src="../../static/nav-7.png" mode="widthFix" class="icon"></image>
						<text class="name">付款申请</text>
					</view>
					<view class="nav">
						<image src="../../static/nav-8.png" mode="widthFix" class="icon"></image>
						<text class="name">费用报销</text>
					</view>
				</view>
				<view class="nav-row">
					<view class="nav">
						<image src="../../static/nav-9.png" mode="widthFix" class="icon"></image>
						<text class="name">公告通知</text>
					</view>
					<view class="nav">
						<image src="../../static/nav-10.png" mode="widthFix" class="icon"></image>
						<text class="name">在线审批</text>
					</view>
					<view class="nav">
						<image src="../../static/nav-11.png" mode="widthFix" class="icon"></image>
						<text class="name">物品领用</text>
					</view>
					<view class="nav">
						<image src="../../static/nav-12.png" mode="widthFix" class="icon"></image>
						<text class="name">采购申请</text>
					</view>
				</view>
			</view>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				unreadRows: 0,
				title: 'Hello',
				imgurls: ["https://szlsay-1301558572.cos.ap-beijing.myqcloud.com/emos/img/banner/swiper-1.jpg",
					"https://szlsay-1301558572.cos.ap-beijing.myqcloud.com/emos/img/banner/swiper-2.jpg",
					"https://szlsay-1301558572.cos.ap-beijing.myqcloud.com/emos/img/banner/swiper-3.jpg",
					"https://szlsay-1301558572.cos.ap-beijing.myqcloud.com/emos/img/banner/swiper-4.jpg",
					"https://szlsay-1301558572.cos.ap-beijing.myqcloud.com/emos/img/banner/swiper-5.jpg"
				]
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
