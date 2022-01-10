function myfucntion(){
    var input,filter,ul, li , a ,i ,txtValue;
    input = document.getElementById("searcht");
    filter = input.value.toUpperCase();
    ul = document.getElementById("myUL");
    li = ul.getElementsByTagName('li');
    for(i=0;i<li.length;i++){
        a = li[i].getElementsByTagName("a")[0];
        txtValue = a.textContent ||a.innerText;
        if(txtValue.toUpperCase().indexOf(filter)>-1){
            li[i].style.display = "";
        }else{
            li[i].style.display="none";
        }
    }
    // var cardTitle = ul.getElementsByClassName('card-Title');
    // for(i=0;i<li.length;i++){
    //     a = cardTitle[i].getElementsByClassName("a")[0];
    //     txtValue = a.textContent ||a.innerText;
    //     if(txtValue.toUpperCase().indexOf(filter) > -1){
    //         cardTitle[i].style.display = "";
    //     }else{
    //         cardTitle[i].style.display="none";
    //     }
    // }
}

a  = "heb"
var id = document.getElementsByClassName('div');
document.write(a );
document.writeln("write");
function years (form){
    form.dog.value = form.age.value * 7;
}
l = 1;
function clic(){
    // document.getElementById('cli').innerHTML = "hello";
    document.getElementById('copy').value = document.getElementById('copy');
    // document.write(a);
    var c = " Hello";
    var d = " Hello";
    // document.getElementById('copy').innerHTML = d.length;
    if(c==d){
        return true;
    }else{
        return false;
    }
} 
   
