<template>
  <div class="input-con">
    <span>您的昵称：</span>
    <label>
      <textarea
        ref="Message"
        type="text"
        :value="value"
        @input="updateValue"
        placeholder="请输入昵称"></textarea>
    </label>
  </div>
</template>

<script>
  export default {
      name: "vInput",
      props:{
          value: {
            type: String,
            default: ''
          }
      },
    methods: {
        updateValue: function (event) {
          this.$emit('input',event.target.value)
        },
      focus: function () {
        this.$refs.Message.focus()
      }
    }
  }
</script>

<style scoped>
  .input-con{
    display: flex;
    flex-direction: row;
    /*justify-content: center;*/
  }
  span{
    width: 100px;
    display: inline-block;
    text-align: right;
    vertical-align: top;
  }
  textarea{
    border: 1px solid #e6e6ee;
    padding: 4px 5px;
    line-height: 24px;
    border-radius: 5px;
    width: 300px;
    height: 25px;
  }
</style>
