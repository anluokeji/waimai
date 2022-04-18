<template>
  <div class="right_bottom"><img src="./images/img.png" alt="">
  <p>扫一扫联系我</p></div>
</template>

<script>
export default {
  name: "index"
}
</script>

<style scoped type="text/css">
div {

  overflow: hidden;
  z-index: 9999;
  position: fixed;
  padding: 5px;
  text-align: center;
  width: 175px;
  height: 200px;
  border-bottom-left-radius: 4px;
  border-bottom-right-radius: 4px;
  border-top-left-radius: 4px;
  border-top-right-radius: 4px;
}

/*右下角*/

div.right_bottom {
  right: 10px;
  bottom: 10px;
}
</style>