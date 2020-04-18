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
    <el-main style="height: 800px; background-color: #efefef; width: 100%; margin: 0 auto">
      <div class="main_01" style="width: 1000px; margin: 0  auto">
        <article class="main_me" style="height: 600px;padding: 20px 50px; background-color: #ffffff">
          <h2>博主简介</h2>
          <div class="myWord">
            <div style="height: 100px">
                <span style="font-family: 等线; font-size: 18px">{{massage}}</span>
            </div>
            <div class="main_nav">
              <el-tabs v-model="activeName" @tab-click="handleClick" style="font-size: 15px">
                <el-tab-pane label="基本信息" name="first">
                  <p>网名：破音楠</p>
                  <p>Coser Name： 楚子俞 | 楚狂</p>
                  <p>邮箱：kennenwang98@163.com</p>
                  <p>Github：<a href="https://github.com/KennenWang98" target="_blank">https://github.com/KennenWang98</a></p>
                  <p>微信：</p>
                  <p><img src="@/assets/weixin.jpg" style="height: 150px;width: 150px"></p>
                </el-tab-pane>
                <el-tab-pane label="工作技能" name="second">
                  <p>Web前端开发</p>
                  <p>1、熟练使用Java/JavaScript/HTML5/CSS3，熟悉页面布局</p>
                  <p>2、熟悉HTTP协议、TCP/IP协议</p>
                  <p>3、了解Vue、React等前端框架</p>
                  <p>4、能使用Git进行版本管理 </p>
                  <p>5、根据产品需求，配合后端实现前端的页面功能</p>
                </el-tab-pane>
                <el-tab-pane label="项目经历" name="third">
                  <p>2019.12  中华写字课堂作业收发系统 | 前端开发</p>
                  <p>1、负责项目的客户需求分析、客户调研、用户故事编写等工作</p>
                  <p>2、负责Web端的设计与开发、完成了该系统的后台管理功能</p>
                  <p>3、一周时间内完成了对Vue框架的基础学习，并使用Vue框架完成了该系统Web端所有界面的开发</p>
                  <p>4、参与编写完善开发各阶段的文档资料</p>
                  <p>5、项目github地址：<a href="https://github.com/KennenWang98/WeChat-homework-send-receive-applet" target="_blank">
                    https://github.com/KennenWang98/WeChat-homework-send-receive-applet</a></p>
                </el-tab-pane>
                <el-tab-pane label="兴趣爱好" name="fourth">
                  <p>兴趣爱好</p>
                  <p>✦ 一个属鸽子的佛系Coser 经常因为身高不知道出什么角色</p>
                  <p>✦ 舞台剧 打戏可安排</p>
                  <p>✦ 篮球、足球、游泳都可以玩玩啦</p>
                  <p>✦ 虽然唱歌难听还是忍不住制造噪音</p>
                  <p>✦ 喜欢拆东西 虽然经常装不回去</p>
                </el-tab-pane>
              </el-tabs>
            </div>
          </div>
        </article>
      </div>
    </el-main>
    <el-footer class="el-footer">
      <h4>Design by  破音楠</h4>
    </el-footer>
  </el-container>
</template>

<script>
  export default {
    name: "Profile",
    data() {
      return {
        massage: '王凯楠，男，一条98年咸鱼,就读于合肥工业大学软件工程专业。刚刚接触前端，正在学习过程中，分享一些学习过程中的心得体会，记录自己的生活。',
        activeName: 'first',
      }
    },
    methods: {
      handleClick(tab, event) {
        console.log(tab, event);
      }
    }
  };
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
    padding: 0px;
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

  .nav a{
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

  .nav a:hover,.nav a:active{
    background-color: #dcd3b2;
    opacity: 0.7;
  }

  .el-footer {
    text-align: center;
  }
  .el-footer h4{
    font-weight: lighter;
  }
</style>
