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


function years (form){
    form.dog.value = form.age.value * 7;
}
i = 1;
function clic(x){
    var z = x;
    document.getElementById('paste').innerHTML= z;

}
function clica(){
    if(i>1){
        i-=1;
    document.getElementById('count').innerHTML= i;
    }
}
function copy(){
    document.getElementById('copy').innerHTML = "hello";
}
function clone(){
    var clone = document.getElementById("para1");
    var cln = clone.cloneNode(true);
    document.getElementById("para").append(cln);
}
