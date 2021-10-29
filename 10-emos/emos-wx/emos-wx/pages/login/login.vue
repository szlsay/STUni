<template>
	<view>
		<image class="logo" src="../../static/logo-1.png" mode="widthFix"></image>
		<view class="logon-title">EMOS企业在线办公系统</view>
		<view class="logon-subtitle">Ver 1.0</view>
		<button class="login-btn" open-type="getUserInfo" @tap="login">登录系统</button>
		<view class="register-container">
			没有账号？
			<text class="register" @tap="toRegister">立即注册</text>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				
			}
		},
		methods: {
			toRegister: function(){
				uni.navigateTo({
					url: "../register/register"
				})
			},
			login: function(){
				let that = this;
				uni.login({
					provider:"weixin",
					success:function(resp){
						console.log(resp)
					
						// uni.showModal({
						// 	content: resp.code,
						// 	showCancel: false
						// });
						// that.ajax(that.url.login, "POST", {"code": resp.code}, function(resp){
						// 	let permission = resp.data.permission
						// 	uni.showToast({
						// 		title: permission
						// 	});
						// })
					},
					fail:function(e){
						uni.showToast({
							title: '执行异常'
						});
					}
				})
			}
		}
	}
</script>

<style lang="less">
@import url("login.less");
</style>
