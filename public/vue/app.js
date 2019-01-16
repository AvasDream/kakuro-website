$(document).ready(function () {
console.log("I get executed");
//import Vue from 'vue';
  var app = new Vue({
    el: '#app',
    data: {
      message: 'Hello Vue!'
    }
  });

});

Vue.component('kakuro-field', {
    template:`
        <div class="gamecontainer">
            <p>Hallo Welt</p>
        </div>
    `,
    data: function () {
        return {
            houses: sudokuHouses
        }
    },

})
