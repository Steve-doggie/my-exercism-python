//
// This is only a SKELETON file for the 'Line Up' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

const getOrdinalSuffix = (num) => {
  const lastTwoDigits = num % 100;
  if (lastTwoDigits == 11 || lastTwoDigits == 12 || lastTwoDigits == 13){
    return "th";
  }

  const lastDigit = num % 10;
  switch (lastDigit){
    case 1: return "st";
    case 2: return "nd";
    case 3: return "rd";  
    default: return "th";
  }

};


export const format = (name, number) => {
  const suffix = getOrdinalSuffix(number);

  return `${name}, you are the ${number}${suffix} customer we serve today. Thank you!`;
 
};


