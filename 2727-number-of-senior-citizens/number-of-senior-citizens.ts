function countSeniors(details: string[]): number {
    let seniorCount: number = 0;  

    for (let i = 0; i < details.length; i++){
        let age: number = parseInt(details[i].charAt(11) + parseInt(details[i].charAt(12)), 10); 

        if (age > 60){
            seniorCount++;
        }
    }

    return seniorCount; 
};