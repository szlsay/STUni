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
			toRegister: function() {
				uni.navigateTo({
					url: "../register/register"
				})
			},
			login: function() {
				console.log("login");
				let that = this
				uni.login({
					provider: "weixin",
					success: function(resp) {
						let code = resp.code
						console.log(code)
						that.ajax(that.url.login, "POST", {
							"code": code
						}, function(resp) {
							console.log(resp)
							let permission = resp.data.permission
							console.log(permission)
							uni.setStorageSync("permission", permission)
							//跳转到登陆页面
							uni.switchTab({
								url: "../index/index"
							})
						})
					},
					fail: function(e) {
						console.log(e)
						uni.showToast({
							icon: "none",
							title: "执行异常"
						})
					}
				})
			}
		}
	}
</script>

<style lang="less">
	@import url("login.less");
</style>
