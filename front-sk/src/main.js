import Vue from 'vue';
import App from './App.vue';
import Router from 'vue-router';
import {router} from './routes';
import store from './vuex';
import Swal from 'sweetalert2';
import Notifications from 'vue-notification'

Vue.config.productionTip = false;

Vue.use(Router);
Vue.use(Notifications);
Vue.prototype.$Swal = Swal;

new Vue({
    router,
    store,
    render: h => h(App),
}).$mount('#app');
