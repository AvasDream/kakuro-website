var DEBUG=true
var POSDEBUG=false
var VALUE=null
var CELL=null
var BASEURL="https://kakuro.herokuapp.com"
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
        //Set global Cell
        CELL=cell

      },
    },
    mounted() {
      fetch(BASEURL+"/api/kakuro/initgame")
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
                  <h3 class="cell_value" :id="cell.row+'.'+cell.col" :row="cell.row" :col="cell.col">
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
function setValue() {
  if (VALUE != null && CELL != null) {
    fetch(BASEURL+"/api/kakuro/set/"+CELL.row+"/"+CELL.col+"/"+VALUE)
    .then(response => response.json())
    .then((data) => {
      refreshGrid(data)
    })
  }
}
function deleteValue() {
  if (VALUE != null && CELL != null) {
    fetch(BASEURL+"/api/kakuro/delete/"+CELL.row+"/"+CELL.col)
    .then(response => response.json())
    .then((data) => {
      refreshGrid(data)
    })
  }
}
function undo() {
  fetch(BASEURL+"/api/kakuro/undo")
  .then(response => response.json())
  .then((data) => {
    refreshGrid(data)
  })
}
function redo() {
  fetch(BASEURL+"/api/kakuro/redo")
  .then(response => response.json())
  .then((data) => {
    refreshGrid(data)
  })
}
function save() {
  fetch(BASEURL+"/api/kakuro/save")
  .then(response => response.json())
  .then((data) => {
    refreshGrid(data)
  })
}
function load() {
  fetch(BASEURL+"/api/kakuro/load")
  .then(response => response.json())
  .then((data) => {
    refreshGrid(data)
  })
}
/*
Function to refresh grid after communication with backend
*/
function refreshGrid(game) {
  for (var i = 0; i < game.grid.cells.length; i++) {
    var cell = game.grid.cells[i]
    if (cell.cell.type == "1" && cell.cell.value != "0") {
      document.getElementById(cell.row+"."+cell.col).innerHTML = String(cell.cell.value);
    }
    if (cell.cell.type == "1" && cell.cell.value == "0") {
      document.getElementById(cell.row+"."+cell.col).innerHTML = String("");
    }
  }
}
document.addEventListener("keyup", function(event) {
  console.log(event);
  switch (event.key) {
    case "1":
      VALUE=1
      setValue()
      break;
    case "2":
      VALUE=2
      setValue()
      break;
    case "3":
      VALUE=3
      setValue()
      break;
    case "4":
      VALUE=4
      setValue()
      break;
    case "5":
      VALUE=5
      setValue()
      break;
    case "6":
      VALUE=6
      setValue()
      break;
    case "7":
      VALUE=7
      setValue()
      break;
    case "8":
      VALUE=8
      setValue()
      break;
    case "9":
      VALUE=9
      setValue()
      break;
    case "d":
      deleteValue()
      break;
    case "u":
      undo()
      break;
    case "Backspace":
      undo()
      break;
    case "r":
      redo()
      break;
    case "s":
      save()
      break;
    case "l":
      load()
      break;
    default:

  }
});


});
