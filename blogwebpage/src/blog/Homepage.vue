<template>
  <div class="container">
    <div class="header_main_footer">
      <div class="hmf">
        <div class="header">
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
        </div>
        <div class="main">
          <h2>欢迎进入破音楠的博客</h2>
          <h3>愿你在这里找到你正在寻找的东西</h3>
        </div>
        <div class="footer">
          <h4>Design by  破音楠</h4>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
    export default {
        name: "Homepage"
    }
</script>

<style scoped>
  .footer{
    width: 100%;
    height: 187px;
  }

  .header{
    width: 100%;
    height: 80px;
    padding: 0;
  }

  .main{
    width: 100%;
    height: 650px;
    text-align: center;
    position: relative;
    padding: 0;
    margin: 0;
  }

  .main h2,h3{
    position: relative;
    color: #16160e;
    font-family: 等线;
    font-size: 35px;
    letter-spacing: 20px;
    left: 50%;
    top: 35%;
    -webkit-transform: translate(-50%, -50%);
    -moz-transform: translate(-50%, -50%);
    -ms-transform: translate(-50%, -50%);
    -o-transform: translate(-50%, -50%);
    transform: translate(-50%, -50%);
  }

  .main h3{
    font-size: 20px;
    letter-spacing: 10px;
  }

  .container{
    margin: 0;
    width: 100%;
    height: 100%;
    text-align: center;
  }

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

  .header_main_footer{
    background: url("../assets/07-2.jpg") 0 0 repeat;
    background-size: cover;
    width: 100%;
    height: 100%;
    margin: 0;
    padding: 0;
  }

  body{
    margin: 0;
    padding: 0;
    width: 100%;
    height: 100%;
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

  .footer h4{
    font-weight: lighter;
  }

</style>
