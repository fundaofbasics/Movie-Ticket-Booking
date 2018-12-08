
function validate()
{
var x=document.forms["myform"]["Movie"].value;
if(x==null || x=="")
{
  alert("Fill movie name!");
  return false;
}




var y=document.forms["myform"]["Location"].value;
if(y==null || y=="")
{
  alert("Fill theatre location !");
  return false;
}

var z=document.forms["myform"]["Shows"].value;
if(z==null || z=="")
{
  alert("Fill show time !");
  return false;
}





var p=document.forms["myform1"]["Movie1"].value;
if(p==null || p=="")
{
  alert("Fill movie name !");
  return false;
}




else
{return true ;}
}
