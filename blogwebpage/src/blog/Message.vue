<template>
  <el-container>
    <el-header class="el-header" style="height: 80px; border-bottom: 1px solid #ddd;box-shadow: 0 1px 1px rgba(0,0,0,.04);background-color: #fff">
      <nav class="nav">
        <ul class="header_ul">
          <li>
            <router-link to="/" exact>HOMEPAGE</router-link>
            <router-link to="/Photo" exact>PHOTO</router-link>
            <router-link to="/ArticleList" exact>ARTICLE</router-link>
            <router-link to="/Profile" exact>ABOUT ME</router-link>
            <router-link to="/Message" exact>MESSAGE</router-link>
          </li>
        </ul>
      </nav>
    </el-header>
    <el-main style="height: 100%; background-color: #efefef; width: 100%; margin: 0 auto">
      <div class="main_01" style="height:100%; width: 1000px; margin: 0  auto; background-color: #ffffff">
        <div class="message">
          <v-input v-model="username"></v-input>
          <v-textarea v-model="message" ref="message"></v-textarea>
          <div class="btn-con">
            <input @click="handleSend" type="button" class="btn" value="发布"/>
          </div>
          <div style="height: 70%;width: 100%">
            <v-list :list="list" @reply="handleReply"></v-list>
          </div>
        </div>
      </div>
    </el-main>
    <el-footer class="el-footer" >
      <h4>Design by  破音楠</h4>
    </el-footer>
  </el-container>
</template>

<script>
  import vInput from '../blog/message/vInput.vue'
  import vTextarea from '../blog/message/vTextarea.vue'
  import vList from '../blog/message/vList.vue'
  import axios from 'axios'
  export default {
    name: "Massage",
    data () {
      return {
        username: '',
        message: '',
        list:[]
      }
    },
    components: {
      vInput,
      vTextarea,
      vList
    },
    mounted:function() {
      let _this = this
      axios.get('/new/MessageController/ListMessage')
        .then(function(res){
          console.log(res)
          _this.list = res.data.data
        })
        .catch(function(error){
          console.log(error);
        })
    },
    methods: {
      handleSend: function () {
        if (this.username === '') {
          window.alert('请输入昵称')
          return
        }
        if (this.message === '') {
          window.alert('请输入留言内容')
          return
        }

        // 数组list存储了所有的留言内容，通过函数给list添加一项留言数据，添加成功后把文本框置空
        this.list.push({
          name: this.username,
          message: this.message
        })
        this.message = ''
      },
      handleReply: function (index) {
        let name = this.list[index].name
        this.message = '回复@' + name + ':'
        this.$refs.message.focus()
      }
    }
  }
</script>

<style scoped>
  .header_ul{
    margin: 0;
    padding: 0;
    list-style: none;
    height: 100%;
  }
  li{
    width:1000px;
    padding: 0;
    line-height: 80px;
    margin: 0;
    list-style-type: none;
  }
  .nav{
    margin: 0 auto;
    width: 1000px;
    height: 80px;
    position: relative;

  }
  a{
    text-decoration: none;
    width: 200px;
    color: #16160e;
    padding: 0;
    margin: 0;
    display: inline-block;
    font-weight: bold;
    text-align: center;
    line-height: 80px;
    float: left;
  }
  a:hover,a:active{
    background-color: #dcd3b2;
    opacity: 0.7;
  }
  .el-footer {
    text-align: center;
  }
  .el-footer h4{
    font-weight: lighter;
  }


  .message {
    display: flex;
    flex-direction: column;
    padding: 20px;
  }
  .message div{
    margin-bottom: 12px;
    flex-direction: row;
  }
  .message input:focus,
  .message textarea:focus{
    border: 1px solid #3399ff;
    border-radius: 5px;
  }
  .message .btn-con{
    /*text-align: center;*/
    margin-left:100px ;
    display: inline-block;
  }
  .message .btn{
    padding: 6px 15px;
    border: 1px solid #39f;
    border-radius: 4px;
    color: #fff;
    background-color: #39f;
    cursor: pointer;
    outline: none;
  }
</style>
