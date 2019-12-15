const fs = require('fs')
const person = {
    name: 'Chase',
    planet: 'Earth',
    age: '18'
}
const personJSON = JSON.stringify(person)
fs.writeFileSync('1-json.json', personJSON)
const dataBuffer = fs.readFileSync('1-json.json')
const dataJSON = dataBuffer.toString()
const data = JSON.parse(dataJSON)
console.log(data.name)


