<script>
function valid()
{
var x=document.forms["myform"]["id"].value;
if(x==null || x=="")
{
  alert("Fill your id!");
  return false;
}




var y=document.forms["myform"]["pass"].value;
if(y==null || y=="")
{
  alert("Fill your password !");
  return false;
}



else
{return true ;}
}
</script>