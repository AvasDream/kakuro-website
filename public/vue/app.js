$(document).ready(function () {
  const app = new Vue({
    el: '#app',
    data: function ()  {
        return {
          game: [],
        }
    },
    methods: {

    },
    mounted() {
      fetch("http://127.0.0.1:9000/api/kakuro/initgame")
      .then(response => response.json())
      .then((data) => {
        console.log(data);
        this.game = data.grid.cells;
      })
    },
    template:`
        <div class="kakuro-field">
            <div v-for="cell in game" >
              <div v-if="cell.cell.type == '0'">
                <div class="cell_empty"></div>
              </div>
              <div v-else-if="cell.cell.type == '1'">
                <div class="cell_white"></div>
              </div>
              <div v-else-if="cell.cell.type == '2'">
                <div class="cell_black"></div>
              </div>
              </div>
        </div>
    `,
  });

});

Vue.component('kakuro-cell', {
  template: ''
})
