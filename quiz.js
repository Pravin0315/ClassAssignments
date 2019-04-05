var billamount = 77.25;

function gratuity() {
    return billamount * 0.2;
    
}

function totalwithGrat() {
    return gratuity() + billamount;    
    
}
console.log("your total, including gratuity is: $" + totalwithGrat(billamount).toFixed(2));