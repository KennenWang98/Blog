import axios from 'axios'

export const requestSearchPhotos = params => { return axios.get(`/new/PhotosController/ListPhotosByListID`, {params:params});};

export const requestSearchArticles = params => { return axios.get(`/new/ArticleLISTController/ListArticleLISTByID`, {params:params});};

export const requestStarArticles = params => { return axios.get(`/new/StarArticleController/ListStarArticle`, {params:params});};
