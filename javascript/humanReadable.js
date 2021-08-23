/*
    Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)

    HH = hours, padded to 2 digits, range: 00 - 99
    MM = minutes, padded to 2 digits, range: 00 - 59
    SS = seconds, padded to 2 digits, range: 00 - 59

    The maximum time never exceeds 359999 (99:59:59)
*/

function humanReadable(seconds) {
    var secondsInHour = 60*60
    var secondsInMinute = 60
    
    var hours = Math.floor(seconds / secondsInHour);
    var secondsLeft = seconds - hours*secondsInHour;
    
    var minutes = Math.floor(secondsLeft / secondsInMinute);
    seconds = secondsLeft - minutes*secondsInMinute;
    
    return `${padded(hours)}:${padded(minutes)}:${padded(seconds)}`
  }
  
  function padded(number) {
    return number.toString().padStart(2, '0')
  }