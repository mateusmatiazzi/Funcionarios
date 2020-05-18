<template>
  <div class="hello">
    <button @click="mostrarFuncionarios()">Mostrar Funcionarios</button>
    <div v-if="info">
      <p>{{info}}</p>
    </div>  
  </div>
</template>

<script>
import axios from 'axios'

export default {
  name: 'HelloWorld',
  data () {
    return {
      info: ''
    }
  },
  methods: {
    async mostrarFuncionarios(){
      const info = await axios.get("http://localhost:8080/api/funcionarios/todos");
      this.info = info
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
