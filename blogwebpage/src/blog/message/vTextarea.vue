<template>
  <div class="input-con">
    <span>留言内容：</span>
    <textarea
      ref="message"
      type="text"
      :value="value"
      @input="updateValue"
      placeholder="请输入留言内容"></textarea>
  </div>
</template>

<script>
  export default {
    name: "vTextarea",
    props: {
      value: {
        type: String,
        default: ''
      }
    },
    methods: {
      // 监听input值
      updateValue: function (event) {
        this.$emit('input', event.target.value)
      },
      focus: function () {
          this.$refs.message.focus()
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
    width: 500px;
    height: 100px;
  }
</style>
