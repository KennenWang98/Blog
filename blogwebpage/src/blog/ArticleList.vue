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
            <router-link to="/Message" exact>MESSAGE</router-link>
          </li>
        </ul>
      </nav>
    </el-header>
    <el-main style="height: 1800px; background-color: #efefef; width: 100%; margin: 0 auto;">
      <div class="main" style="height: 100%; width: 1000px; margin: 0  auto;">
        <article class="articleBox" >
            <div class="reveal_article" v-for="article in articles"
               :key="article.id"
               v-bind:title="article.title"
               v-bind:con="article.con"
               v-bind:writer="article.writer"
               v-bind:time="article.time"
               v-bind:img="article.img">
            <h3 class="blog_title">
              <router-link :to="{path:'/Article1',query: {article_id: article.id}}">{{article.title}}</router-link>
            </h3>
            <div class="article_img">
              <router-link :to="{path:'/Article1',query: {article_id: article.id}}">
                <img :src="article.img">
              </router-link>
            </div>
            <div class="article_data">
              <div class="article_con">{{article.con}}</div>
              <div class="info">
                <span class="writer">{{article.writer}}</span>
                <span class="time">{{article.time}}</span>
              </div>
            </div>
          </div>
          <el-pagination
            layout="prev, pager, next"
            :total="20"
            :size="6">
          </el-pagination>
        </article>
        <article class="rightBox">
          <div class="right_title">
            <span>博主推荐</span>
          </div>
          <nav class="right_nav">
            <ul class="right_ul">
              <li v-for="star in stars" :key="star.id"
                  v-bind:title="star.title"
                  v-bind:article_id="star.article_id">☆ <router-link :to="{path:'/Article1',query: {article_id: star.article_id}}">{{star.title}}</router-link></li>
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
  import scrollReveal from 'scrollreveal';
  import axios from 'axios';
    export default {
        name: "ARTICLELIST",
      data(){
          return{
            scrollReveal: scrollReveal(),
            articles:[
              {
                id:'1',
                title:'测试标题1',
                con:'dfbhdfgywbdsbjhbsuibuduifsdfkjbgggggggdbhfbsbabbdajhbfhbsjdhbfjhbdshnfjdjjnjvnjnhbsgrbgbrhsbdhfbsebfdhfbsbfjsdhfbhdbfsjhdbfsjdhbfshjfjsjbfehrfjbfajbhbfsjdfbajhbhjdfbaesbbfhabsejgggggggggggggggggggggggggggfsdgggggudjf',
                writer:'破音楠',
                time:'2020-3-25',
                img:'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1586076752559&di=5007bf2a42bbfb6df245bbb46c1498cc&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201612%2F13%2F20161213164601_ZFiEk.jpeg'
                },
              {
                id:'2',
                title:'测试标题2',
                con:'dfbhdfgywbdsbjhbsuibuduifsdfkjbgggggggdbhfbsbabbdajhbfhbsjdhbfjhbdshnfjdjjnjvnjnhbsgrbgbrhsbdhfbsebfdhfbsbfjsdhfbhdbfsjhdbfsjdhbfshjfjsjbfehrfjbfajbhbfsjdfbajhbhjdfbaesbbfhabsejgggggggggggggggggggggggggggfsdgggggudjf',
                writer:'破音楠',
                time:'2020-3-25',
                img:'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1586076752559&di=5007bf2a42bbfb6df245bbb46c1498cc&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201612%2F13%2F20161213164601_ZFiEk.jpeg'
              },
              {
                id:'3',
                title:'测试标题3',
                con:'dfbhdfgywbdsbjhbsuibuduifsdfkjbgggggggdbhfbsbabbdajhbfhbsjdhbfjhbdshnfjdjjnjvnjnhbsgrbgbrhsbdhfbsebfdhfbsbfjsdhfbhdbfsjhdbfsjdhbfshjfjsjbfehrfjbfajbhbfsjdfbajhbhjdfbaesbbfhabsejgggggggggggggggggggggggggggfsdgggggudjf',
                writer:'破音楠',
                time:'2020-3-25',
                img:'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1586076752559&di=5007bf2a42bbfb6df245bbb46c1498cc&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201612%2F13%2F20161213164601_ZFiEk.jpeg'
              },
              {
                id:'4',
                title:'测试标题4',
                con:'dfbhdfgywbdsbjhbsuibuduifsdfkjbgggggggdbhfbsbabbdajhbfhbsjdhbfjhbdshnfjdjjnjvnjnhbsgrbgbrhsbdhfbsebfdhfbsbfjsdhfbhdbfsjhdbfsjdhbfshjfjsjbfehrfjbfajbhbfsjdfbajhbhjdfbaesbbfhabsejgggggggggggggggggggggggggggfsdgggggudjf',
                writer:'破音楠',
                time:'2020-3-25',
                img:'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1586076752559&di=5007bf2a42bbfb6df245bbb46c1498cc&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201612%2F13%2F20161213164601_ZFiEk.jpeg'
              },
              {
                id:'5',
                title:'测试标题5',
                con:'dfbhdfgywbdsbjhbsuibuduifsdfkjbgggggggdbhfbsbabbdajhbfhbsjdhbfjhbdshnfjdjjnjvnjnhbsgrbgbrhsbdhfbsebfdhfbsbfjsdhfbhdbfsjhdbfsjdhbfshjfjsjbfehrfjbfajbhbfsjdfbajhbhjdfbaesbbfhabsejgggggggggggggggggggggggggggfsdgggggudjf',
                writer:'破音楠',
                time:'2020-3-25',
                img:'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1586076752559&di=5007bf2a42bbfb6df245bbb46c1498cc&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201612%2F13%2F20161213164601_ZFiEk.jpeg'
              },
              {
                id:'6',
                title:'测试标题6',
                con:'dfbhdfgywbdsbjhbsuibuduifsdfkjbgggggggdbhfbsbabbdajhbfhbsjdhbfjhbdshnfjdjjnjvnjnhbsgrbgbrhsbdhfbsebfdhfbsbfjsdhfbhdbfsjhdbfsjdhbfshjfjsjbfehrfjbfajbhbfsjdfbajhbhjdfbaesbbfhabsejgggggggggggggggggggggggggggfsdgggggudjf',
                writer:'破音楠',
                time:'2020-3-25',
                img:'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1586076752559&di=5007bf2a42bbfb6df245bbb46c1498cc&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201612%2F13%2F20161213164601_ZFiEk.jpeg'
              },
            ],
            stars:[
              {
                id:'1',
                title:'测试标题1',
                article_id:'1'
              },
              {
                id:'2',
                title:'测试标题2',
                article_id:'2'
              },
              {
                id:'3',
                title:'测试标题3',
                article_id:'3'
              },
              {
                id:'4',
                title:'测试标题4',
                article_id:'4'
              },
              {
                id:'5',
                title:'测试标题5',
                article_id:'5'
              },
              {
                id:'6',
                title:'测试标题6',
                article_id:'6'
              },
            ]
          }
      },
      methods: {
        handleOpen(key, keyPath) {
          console.log(key, keyPath);
        },
        handleClose(key, keyPath) {
          console.log(key, keyPath);
        },
      },
      // mounted(){
      //   let _this = this
      //   axios.get('/new/ArticleLISTController/ListArticleLIST')
      //     .then(function(res){
      //       _this.articles = res.data
      //       console.log(res.data)
      //       this.scrollReveal.reveal('.reveal_article',{
      //         duration: 1000,
      //         delay: 500,
      //         origin:'bottom',
      //         reset:true,
      //         distance:'200px',
      //         opacity:0.001,
      //         easing:'linear',
      //         scale: 0.9,
      //       });
      //     })
      //     .catch(function(error){
      //       console.log(error);
      //     })
      // },
      mounted () {
          this.scrollReveal.reveal('.reveal_article',{
            duration: 1000,
            delay: 500,
            origin:'bottom',
            reset:true,
            distance:'200px',
            opacity:0.001,
            easing:'linear',
            scale: 0.9,
          });

      }
    }
</script>



<style scoped>
  .title h2{
    font-size: 29px;
    font-weight: lighter;
  }
  .info span{
    display: block;
    padding-right: 80px;
    float: left;
  }
  .articleBox{
    padding:0;
    width:68%;
    float: left;
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
  .reveal_article{
    width: 100%;
    height: 200px;
    background-color: #ffffff;
    padding:20px;
    margin: 0 0 20px 0;
  }
  .reveal_article::before{
    position: absolute;
    content: "";
    width: 5px;
    height: 26px;
    background: #3690cf;
    left: 0;
    top: 20px;
  }
  .blog_title{
    margin: 0 0 10px 0;
    font-size:20px;
    overflow: hidden;
    color: #16160e;
  }
  .blog_title a{
    color: #16160e;
    text-decoration: none;
    /*blr:expression(this.onFocus=this.blur());*/
  }
  .blog_title a:hover{
    color: #3690cf;
  }
  .right_nav{
    width: 100%;
    padding: 0;
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
  .article_img{
    width: 200px;
    height: 130px;
    margin: 30px 0 0 0;
    float: left;
  }
  .article_img img{
    width: 100%;
    height: 100%;
  }
  .article_data{
    width: 440px;
    height: 130px;
    float: right;
    margin: 30px 20px 0 0;
  }
  .article_con{
    width: 100%;
    height: 90px;
    margin: 0;
    word-wrap: break-word;
    word-break: normal;
    overflow: hidden;
    text-overflow: ellipsis;
    font-size: 15px;
    line-height: 30px;
  }
  .info{
    font-weight: normal;
    font-family: 等线;
    font-size: 15px;
  }
  .info span{
    display: block;
    padding: 20px 80px 0 20px;
    float: left;
  }

</style>
