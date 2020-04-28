const chalk = require('chalk')
const yargs = require('yargs')
const getNotes = require('./notes.js')

yargs.version('1.1.0')


//add, remove, read, list

yargs.command({
    command: 'add',
    describe: 'Add a new note',
    handler: function (){
        console.log('Adding a new note')
    }
})
//remove command
yargs.command({
    command: 'remove',
    describe: 'Remove a note',
    handler: function(){
        console.log('Removing the note')
    }
})
yargs.command({
    command: 'list',
    describe: 'List the notes',
    handler: function () {
        console.log('Listing a note')
    }
})
yargs.command({
    command: 'read',
    describe: 'Read a note',
    handler: function () {
        console.log('Reading the note')
    }
})

console.log(yargs.argv)
