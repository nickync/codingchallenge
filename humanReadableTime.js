/* Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)

HH = hours, padded to 2 digits, range: 00 - 99
MM = minutes, padded to 2 digits, range: 00 - 59
SS = seconds, padded to 2 digits, range: 00 - 59
The maximum time never exceeds 359999 (99:59:59)

You can find some examples in the test fixtures. */

//JS
function humanReadable (seconds) {

    let hour = ('00' + Math.floor(seconds / 3600)).substr(-2),    
        hour_remainder = Math.floor(seconds % 3600),
        minutes = ('00' + Math.floor(hour_remainder / 60)).substr(-2),
        minutes_remainder = ('00' + hour_remainder % 60).substr(-2)
     
    return `${hour}:${minutes}:${minutes_remainder}`
  
}

// Best Solution 
function humanReadable(seconds) {
    return [(seconds / 3600) | 0, seconds % 3600 / 60, seconds % 3600 % 60].map(n => ('0' + ( '' + n|0)).substr(-2)).join(':')
}