<template>
    <div id="JoinAuth" class="wrapC">
        <div id="JoinAuth-form">
            <div>
                <h1>인증번호 확인</h1>
                <button class="close" @click="close">
                    <img class="close-img" src="../../assets/images/close.png" />
                </button>
                <h3>{{ email }} 로 인증번호가 발송되었습니다.</h3>
            </div>
            <div class="input-with-label">
                <input
                    v-model="auth"
                    v-bind:class="{
                        error: error.auth,
                        complete: !error.auth && auth.length !== 0,
                        disabled: !auth,
                    }"
                    @keyup.enter="submit"
                    id="auth"
                    placeholder="인증번호를 입력하세요."
                    type="text"
                    maxlength="6"
                />
                <label for="auth">인증번호</label>
                <div class="error-text" v-if="error.auth">{{ error.auth }}</div>
            </div>
        </div>
        <div>
            <button
                class="btn btn--back btn--login"
                @click="submit"
                :disabled="!isSubmit"
                :class="{ disabled: !isSubmit }"
            >
                <span>인증번호 확인</span>
            </button>
        </div>
    </div>
</template>

<script>
import '../../assets/css/user.scss';
import '../../assets/css/style.scss';
import UserApi from '../../apis/UserApi';
import * as EmailValidator from 'email-validator';
import Swal from 'sweetalert2';
import Axios from 'axios';

export default {
    data: () => {
        return {
            email: '',
            auth: '',
            isEmail: false,
            isLoading: false,
            error: {
                auth: false,
            },
            isSubmit: false,
        };
    },
    created() {
        this.component = this;
        this.email = sessionStorage.getItem('tempEmail');
    },
    watch: {
        auth: function(v) {
            this.checkForm();
        },
    },
    methods: {
        checkForm() {
            if (this.auth.length != 6) this.error.auth = '인증번호를 입력하세요.';
            else {
                this.error.auth = false;
                this.isSubmit = true;
            }
        },
        submit() {
            if (this.isSubmit && !this.isEmail) {
                let { email, auth } = this;
                let data = {
                    email,
                    userkey: auth,
                };

                // console.log(data);

                Axios.put('http://192.168.100.70:8083/account/signup', {
                    email,
                    userkey: auth,
                })
                    .then(res => {
                        Swal.fire({
                            icon: 'success',
                            title: '가입완료',
                            text: '루트립에 오신것을 환영합니다!',
                        });
                        this.$emit('authPopUpToggle');
                        this.$emit('registerFormClose');
                        console.log(res);
                    })
                    .catch(error => {
                        Swal.fire({
                            icon: 'error',
                            title: '인증번호 불일치',
                            text: '인증번호를 확인해 주세요!',
                        });
                        console.log(error);
                    });
            }
        },
        back() {
            this.$router.back();
        },
        close() {
            this.$emit('authPopUpToggle');
        },
    },
};
</script>
