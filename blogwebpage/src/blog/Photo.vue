<template>
  <el-container>
    <el-header class="el-header" style="height: 80px; border-bottom: 1px solid #ddd; box-shadow: 0 1px 1px rgba(0,0,0,.04); background-color: #fff;">
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
      <div class="main_01" style="height: 100%;width: 1000px; margin: 0  auto; background-color: #ffffff">
        <div class="img_div" v-for="photo in photos" :key="photo.id"
             v-bind:photo_url="photo.photo_url"
             v-bind:photo_title="photo.photo_title"
             v-bind:id="photo.id">
          <div class="img_con">
            <router-link :to="{path:'/Photo1',query: {list_id: photo.id}}">
              <img :src="photo.photo_url">
            </router-link>
          </div>
          <div class="img_info">
            <span>
              <router-link :to="{path:'/Photo1',query: {list_id: photo.id}}">{{photo.photo_title}}</router-link>
            </span>
          </div>
        </div>
      </div>
    </el-main>
    <el-footer class="el-footer">
      <h4>Design by  破音楠</h4>
    </el-footer>
  </el-container>
</template>

<script>
  import axios from 'axios'
    export default {
      name: "Photo",
      data() {
        return {
          activeName: 'second',
          photos:[]
        }
      },
      methods: {
        handleClick(tab, event) {
          console.log(tab, event);
        }
      },
      mounted:function() {
        let _this = this
        axios.get('/new/PhotoLISTController/ListPhotoLIST')
          .then(function(res){
            console.log(res)
            _this.photos = res.data
          })
          .catch(function(error){
            console.log(error);
          })
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
  .header_ul li{
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
  .header_ul a{
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
  .header_ul a:hover,.header_ul a:active{
    background-color: #dcd3b2;
    opacity: 0.7;
  }
  .el-footer {
    text-align: center;
  }
  .el-footer h4{
    font-weight: lighter;
  }
  .img_div{
    width: 200px;
    height: 300px;
    float: left;
    background-color: #ffffff;
    margin: 25px;
  }
  .img_con{
    width: 200px;
    height: 250px;
  }
  .img_con img{
    width: 100%;
    height: 100%;
  }
  .img_info{
    padding: 15px 0 0 10px;
    font-family: 等线;
  }
  .img_info a{
    text-decoration: none;
    color: #16160e;
  }
</style>
