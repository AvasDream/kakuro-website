var DEBUG=true
$(document).ready(function () {
  const app = new Vue({
    el: '#app',
    data: function ()  {
        return {
          game: [],
        }
    },
    methods: {
      cellSelected: function (event) {
        // Catch the cases where a Value is in the div element
        if (event.target.getAttribute("class") == "cell_white") {
          var cell = {
            row: event.target.childNodes[0].getAttribute("row"),
            col: event.target.childNodes[0].getAttribute("col"),
            value: event.target.childNodes[0].innerText,
          }
        } else {
          var cell = {
            // Why the fuck does this work?
            row: event.target.parentElement.childNodes[0].getAttribute("row"),
            col: event.target.parentElement.childNodes[0].getAttribute("col"),
            value: event.target.parentElement.childNodes[0].innerText,
          }
        }
      if(DEBUG) console.log(cell);
      },
      dontDoAnything: function (event) {
        event.preventDefault();
      }
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
                <div class="cell_empty" :row="cell.row" :col="cell.col">
                </div>
              </div>
<!-- END -->
<!-- White Cell -->
              <div v-else-if="cell.cell.type == '1'">
                <div class="cell_white" v-on:click="cellSelected">
                  <h3 class="cell_value" :row="cell.row" :col="cell.col" v-on:click="dontDoAnything">
                  </h3>
                </div>
              </div>
<!-- END -->
<!-- Black Cell -->
              <div v-else-if="cell.cell.type == '2'">
                <div class="cell_black" :row="cell.row" :col="cell.col">
<!-- Both sums down & right -->
                  <div v-if="cell.cell.down != '0' && cell.cell.right != '0'">
                    <h3  class="both_right_sum" >
                      {{cell.cell.right}}
                    </h3>
                    <h3  class="both_down_sum">
                      {{cell.cell.down}}
                    </h3>
                  </div>
<!-- down -->
                  <div v-if="cell.cell.down != '0' && cell.cell.right == '0'">
                    <h3  class=down_sum>
                      {{cell.cell.down}}
                    </h3>
                  </div>
<!-- right sum -->
                    <div v-if="cell.cell.right != '0' && cell.cell.down == '0'">
                      <h3  class=right_sum>
                        {{cell.cell.right}}
                      </h3>
                    </div>
                  </div>
                </div>
<!-- END -->
                </div>
              </div>
    `,
  });
});
