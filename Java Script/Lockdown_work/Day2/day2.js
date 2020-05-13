//array highest no 
var arr=[1,2,3,4,5,6,7,8,9,10];
document.getElementById("arr").innerHTML=arr;
arr.sort(function(a,b){return a-b});
document.getElementById("high").innerHTML=arr[0];

//print name 
function My_name()
{
    document.getElementById("Name").innerHTML="Shriraj Thorat";
}

//Unhide name by clicking button
document.getElementById("n").style.visibility = "hidden";
function showElem() {
    document.getElementById("n").style.visibility = "visible"; 
  }


//Date and time (current)
  function date()
  {
    var d = new Date();
    document.getElementById("demo").innerHTML = d;
  }


// array ascending order 
    var arr=[5,78,2,0,45,25,89,80,99,10];
    document.getElementById("ar").innerHTML=arr;
arr.sort(function(a,b){return a-b});
document.getElementById("asc").innerHTML=arr;
  
 
//array descending order
var asrr=["asd","bds","cds","ert","gf"];
document.getElementById("str").innerHTML=asrr;
asrr.sort();
asrr.reverse();
document.getElementById("dsc").innerHTML=asrr;

//Genrate random no. 
function random()
{
    document.getElementById("ran").innerHTML =
Math.floor(Math.random() * 10);
}

//Check @ 
var c="shrirajthorat@gmail.com";
document.getElementById("s").innerHTML=c;
var a=c.includes("@");
document.getElementById("c").innerHTML=a;


//check mob no. digit
var no="9421227583";
document.getElementById("q").innerHTML=no;
function check()
{
  var n=no.length;
  if(n==10)
  {
    document.getElementById("l").innerHTML="10 digit number";
  }else{
    document.getElementById("l").innerHTML="not 10 digit";
  }
}



//copy text from 1 textbox to 2nd
function copy()
{
 document.getElementById("second").value = document.getElementById("first").value;
}

// Change font size 
function change_size()
{
  var a=document.getElementById("a").innerHTML;
  var s=a.fontsize(7);
  document.getElementById("a").innerHTML=s;
}