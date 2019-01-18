var DEBUG=true
var POSDEBUG=false
$(document).ready(function () {

  const app = new Vue({
    el: '#app',
    data: function ()  {
        return {
          game: [],
          value: "1",
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

        if(POSDEBUG) console.log(cell.row+'.'+cell.col);
        // Set Backgound Color for clicked Cell
        ChangeCellBackground(cell);
        if(DEBUG) console.log(cell);
      },
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
            <div v-for="cell in game" data-container="body" data-toggle="popover" data-placement="bottom" data-content="Vivamus
sagittis lacus vel augue laoreet rutrum faucibus." >
<!-- Empty Cell -->
              <div v-if="cell.cell.type == '0'">
                <div class="cell_empty" :row="cell.row" :col="cell.col">
                </div>
              </div>
<!-- END -->
<!-- White Cell -->
              <div v-else-if="cell.cell.type == '1'">
                <div class="cell_white" :id="'cell_white_'+cell.row+'.'+cell.col" v-on:click="cellSelected">
                  <h3 class="cell_value" :id="cell.row+'.'+cell.col" :row="cell.row" :col="cell.col" v-on:click="dontDoAnything">
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

/*
This Function Takes a Cell as Argument and
iterates over all cells to change the bg color of the picked one
*/
function ChangeCellBackground(cell) {
  var white_cells = document.getElementsByClassName("cell_white");
  for (var i = 0; i < white_cells.length; i++) {
    if (white_cells[i].id == "cell_white_"+cell.row+'.'+cell.col) {
      white_cells[i].style.background="rgb(133, 173, 173)";
    } else {
      white_cells[i].style.background="white";
    }
  }
}


});
