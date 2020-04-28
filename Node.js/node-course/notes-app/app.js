const validator = require('validator')
const getNotes = require('./notes.js')

console.log(getNotes())

console.log(validator.isEmail('chase@outlook.com'))

console.log(validator.isURL('chase.com'))