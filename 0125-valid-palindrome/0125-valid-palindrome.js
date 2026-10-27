/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    s=s.replace(/[^a-zA-Z0-9]/g,"").toLowerCase();
    let t=s;
    s=s.split("").reverse().join("");
    if(s==t){
        return true;
    }else{
        return false;
    }
}