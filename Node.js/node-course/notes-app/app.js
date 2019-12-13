const chalk = require('chalk')
const yargs = require('yargs')
const getNotes = require('./notes.js')

//Customize version
yargs.version('1.1.0')

//create add command
yargs.command({
    command: 'add',
    describe: 'Add a new note.',
    builder: {
        title: {
            describe: 'Note title',
            demandOption: true,
            type: 'string'
        },
        body: {
            describe: 'This is the body of the note.',
            demandOption: true,
            type: 'string'
        },
    },
    handler: function(argv) {
        console.log('Title: ' + argv.title)
        console.log('Body: ' + argv.body)
    }

})
//create remove command
yargs.command({
    command: 'remove',
    describe: 'Removing a note.',
    handler: function() {
        console.log('Removing the note')
    }
})
//create list command
yargs.command({
    command: 'list',
    describe: 'Listing the notes.',
    handler: function(){
        console.log('Listing the notes')
    }
})
//create read command
yargs.command({
    command: 'read',
    describe: 'Reads the notes.',
    handler: function() {
        console.log('Reading the notes')
    }
})
console.log(process.argv)
console.log(yargs.argv)