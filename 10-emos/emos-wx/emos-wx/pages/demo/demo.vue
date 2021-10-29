<template>
	<view>
		<view>{{username}}</view>
		<view v-for="one in tel" :key="index">
			{{one}}
		</view>
		<view v-if="age >= 18">
			<button @click="signUp">我要报名</button>
			<button @tap="signUp">我要报名</button>
		</view>
		<view>
			<input type="text" v-model="address" placeholder="请输入" />
		</view>
		<view>{{address}}</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				username: "st",
				tel: ["st1", "st2"],
				age: 18,
				address: ""
			}
		},
		methods: {
			signUp: function(){
				uni.showToast({
					title: "hi, st"
				})
			}
		}
	}
</script>

<style>

</style>
