import Vue from 'vue'
import Router from 'vue-router'
import Homepage from '../blog/Homepage'
import PhotoWall from '../blog/Photo'
import ArticleList from '../blog/ArticleList'
import Profile from '../blog/Profile'
import Message from '../blog/Message'
import Article1 from "../blog/Article/Article1"
import Photo1 from '../blog/Photo/Photo1'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Homepage',
      component: Homepage
    },
    {
      path:'/Photo',
      name:'Photo',
      component: PhotoWall
    },
    {
      path:'/ArticleList',
      name:'ArticleList',
      component: ArticleList
    },
    {
      path:'/Profile',
      name:'Profile',
      component: Profile
    },
    {
      path:'/Message',
      name:'Message',
      component: Message
    },
    {
      path:'/Article1',
      name:'Article1',
      component: Article1
    },
    {
      path:'/Photo1',
      name:'Photo1',
      component: Photo1
    },
  ],
  scrollBehavior (to, from, savedPosition) {
    if (savedPosition) {
      return savedPosition
    } else {
      return {x: 0, y: 0}
    }
  }
})
