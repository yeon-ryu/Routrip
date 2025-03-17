// Import Router
import Router from 'vue-router';

// Import Common Components
import Main from './views/jh/Main.vue';
import Detail from './views/jh/Detail.vue';
import Search from './views/jh/Search.vue';
import SearchAll from './views/jh/SearchAll.vue';
import Middleware from './views/jh/Middleware.vue';
import Login from './views/user/Login.vue';
import Join from './views/user/Join.vue';
import JoinAuth from './views/user/JoinAuth.vue';
import ErrorPage from './views/error/Error.vue';
import PageNotFound from './views/error/PageNotFound.vue';

// Import User Service Components
import Profile from './views/user/profile/Profile.vue';
import ChangePassword from './views/user/ChangePassword.vue';
import FindEmailAndPassword from './views/user/FindEmailAndPassword.vue';

// Import Post Components
import UserPost from './views/user/profile/UserPost.vue';
import UserComment from './views/user/profile/UserComment.vue';
import UserLike from './views/user/profile/UserLike.vue';
import UserPeople from './views/user/profile/UserPeople.vue';
import UserScrap from './views/user/profile/UserScrap.vue';
import WriteForm from './views/main/WriteForm.vue';
import PictureRegister from './views/user/profile/PictureRegister.vue';

// Import Etc Components
import Components from './views/Components.vue';
import Alarm from './views/user/Alarm.vue';

export const router = new Router({
  mode: 'history',
  routes: [{
    path: '/',
    name: 'Login',
    component: Login,
  },
  {
    path: '/profile',
    name: 'Profile',
    component: Profile,
    children: [
      {
        path: '',
        name: 'UserPost',
        components: {
          profile: UserPost,
        },
      },
      {
        path: 'comment',
        name: 'UserComment',
        components: {
          profile: UserComment,
        },
      },
      {
        path: 'like',
        name: 'UserLike',
        components: {
          profile: UserLike,
        },
      },
      {
        path: 'people',
        name: 'UserPeople',
        components: {
          profile: UserPeople,
        },
      },
      {
        path: 'scrap',
        name: 'UserScrap',
        components: {
          profile: UserScrap,
        },
      },
    ],
  },
  {
    path: '/user/ChangePassword',
    name: 'ChangePassword',
    component: ChangePassword,
  },
  {
    path: '*',
    name: 'PageNotFound',
    component: PageNotFound,
  },
  {
    path: '/error',
    name: 'ErrorPage',
    component: ErrorPage,
  },
  {
    path: '/WriteForm',
    name: 'WriteForm',
    component: WriteForm,
  },
  {
    path: '/components',
    name: 'Components',
    component: Components,
  },
  {
    path: '/main',
    name: 'Main',
    component: Main,
  },
  {
    path: '/detail',
    name: 'Detail',
    component: Detail,
  },
  {
    path: '/updatePost',
    name: 'UpdatePost',
    component: WriteForm,
  },
  {
    path: '/search',
    name: 'Search',
    component: Search,
  },
  {
    path: '/searchAll/:searchWord',
    name: 'SearchAll',
    component: SearchAll,
  },
  {
    path: '/middleware',
    name: 'Middleware',
    component: Middleware,
  },
  {
    path: '/alarm',
    name: 'Alarm',
    component: Alarm,
  },
  ],
})