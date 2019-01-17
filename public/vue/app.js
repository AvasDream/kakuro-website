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
<!-- Empty Cell -->
              <div v-if="cell.cell.type == '0'">
                <div class="cell_empty"></div>
              </div>
<!-- White Cell -->
              <div v-else-if="cell.cell.type == '1'">
                <div class="cell_white"></div>
              </div>
<!-- Black Cell -->
              <div v-else-if="cell.cell.type == '2'">
                <div class="cell_black">
<!-- Both sums down & right -->
                  <div v-if="cell.cell.type == '2'">
                    <h3  class=both_right_sum>
                      {{cell.cell.type}}
                    </h3>
                    <h3  class=both_down_sum>
                      {{cell.cell.type}}
                    </h3>

                  </div>
<!-- down -->
                  <div v-if="cell.cell.type == '22'">
                    <h3  class=down_sum>
                      {{cell.cell.type}}
                    </h3>
<!-- right sum -->
                    <div v-if="cell.cell.type == '22'">
                      <h3  class=right_sum>
                        {{cell.cell.type}}
                      </h3>
                  </div>
                </div>
              </div>
              </div>
        </div>
    `,
  });

});

Vue.component('kakuro-cell', {
  template: ''
})
