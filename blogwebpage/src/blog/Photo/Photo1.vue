<template>
  <el-container>
    <el-header class="header" style="height: 80px; border-bottom: 1px solid #ddd;box-shadow: 0 1px 1px rgba(0,0,0,.04);background-color: #fff">
      <nav class="nav">
        <ul class="header_ul">
          <li>
            <router-link to="/" exact>HOMEPAGE</router-link>
            <router-link to="/Photo" exact>PHOTO</router-link>
            <router-link to="/ArticleList" exact>ARTICLE</router-link>
            <router-link to="/Profile" exact>ABOUT ME</router-link>
            <router-link to="/Massage" exact>MASSAGE</router-link>
          </li>
        </ul>
      </nav>
    </el-header>
    <el-main style="height: 100%; background-color: #efefef; width: 100%; margin: 0 auto;">
      <div class="main" style="height: 100%; width: 1000px; margin: 0  auto;">
        <article class="articleBox">
          <div class="article">
            <div class="info_Photo" v-for="info in infos" :key="info.photo_title"
            v-bind:photo_title="info.photo_title" v-bind:writer="info.writer" v-bind:time="info.time">
              <div class="title">
                <h2>{{info.photo_title}}</h2>
              </div>
              <div class="info">
                <span>上传：{{info.writer}}</span>
                <span class="time">{{info.time}}</span>
              </div>
            </div>
            <div class="photo_con" style="padding: 20px 0 0 0"
                 v-for="photo in photos" :key="photo.id"
                 v-bind:photo_url="photo.photo_url">
              <img class="main_con" :src="photo.photo_url" />
            </div>
          </div>
        </article>
        <article class="rightBox">
          <div class="right_title">
            <span>博主推荐</span>
          </div>
          <nav class="right_nav">
            <ul class="right_ul">
              <li v-for="star in stars" :key="star.id"
                  v-bind:title="star.title"
                  v-bind:article_id="star.article_id">☆ <router-link :to="{path:'/Article1',query: {article_id: star.article_id}}" @click.native="flushCom">{{star.title}}</router-link></li>
            </ul>
          </nav>
        </article>
      </div>
    </el-main>
    <el-footer class="el-footer">
      <h4>Design by  破音楠</h4>
    </el-footer>
  </el-container>
</template>

<script>
  import {requestSearchPhotoLIST, requestSearchPhotos} from "../../api/api";
  import axios from 'axios';

  export default {
    name: "ARTICLE",
    data(){
      return{
        photos:[],
        stars:[],
        infos:[]
      }
    },
    mounted:function() {
      let list_id_in = this.$route.query.list_id
      let searchPhotos = {list_id: list_id_in}
      //console.log(searchPhotos)
      requestSearchPhotos(searchPhotos).then(data =>{
          //console.log(data)
          let status = data.status;
          let msg = data.msg;
          this.photos = data.data;
          //console.log(this.photos)
          if (status !== 200) {
            this.$message({
              message: msg,
            });
          }
        });

      let searchPhotoList = {id: list_id_in}
      //console.log(searchPhotos)
      requestSearchPhotoLIST(searchPhotoList).then(data =>{
        console.log(data)
        let status = data.status;
        let msg = data.msg;
        this.infos = data.data;
        //console.log(this.photos)
        if (status !== 200) {
          this.$message({
            message: msg,
          });
        }
      });


      let _this = this
      axios.get('/new/StarArticleController/ListStarArticle')
        .then(function(res){
          //console.log(res)
          _this.stars = res.data
        })
        .catch(function(error){
          console.log(error);
        })
      },

    methods: {
      handleOpen(key, keyPath) {
        console.log(key, keyPath);
      },
      handleClose(key, keyPath) {
        console.log(key, keyPath);
      },
      flushCom:function(){
        this.$router.go(0);
      }
    }
  }
</script>

<style scoped>
  .photo_con img{
    height: 100%;
    width: 100%;
  }
  .main_con{
    word-break:break-all;
    padding: 10px;
  }
  .time{
    font-size: 17px;
  }
  .title h2{
    font-size: 29px;
    font-weight: lighter;
  }
  .article{
    padding: 30px;
  }
  .info{
    font-weight: lighter;
    font-family: 等线;
    font-size: 18px;
  }
  .info span{
    display: block;
    padding-right: 80px;
    float: left;
  }
  .articleBox{
    height: 100%;
    padding:0;
    width:68%;
    background-color:#ffffff;
    float: left;
  }
  .rightBox{
    height:500px;
    padding:0;
    width:26%;
    background-color:#ffffff;
    float:right;
    margin-bottom: 20px;
  }
  el-header{
    width: 100%;
    height: 80px;
    padding: 0;
  }
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
  el-menu-item{
    width: 100%;
  }
  .rightBox{
    height:500px;
    padding:0;
    width:26%;
    background-color:#ffffff;
    float:right;
    margin-bottom: 20px;
  }
  .right_ul{
    width: 100%;
    padding:0;
    margin: 0;
    display: block;
  }
  .right_ul li{
    list-style-type:none ;
    line-height: 30px;
    margin: 0;
    padding:5px 0 0 10px;
    text-overflow: ellipsis;
    overflow: hidden;
    white-space: nowrap;
  }
  .right_ul a{
    text-decoration: none;
    font-size: 15px;
    color: #16160e;
  }
  .right_title{
    width: 100%;
    padding: 10px 0 0 10px;
    font-size: 15px;
    margin: 0;
    line-height: 1.5;
  }
</style>
