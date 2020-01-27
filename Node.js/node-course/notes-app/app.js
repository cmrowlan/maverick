const chalk = require('chalk')
const yargs = require('yargs')
const notes = require('./notes.js')

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
        }
    },
    handler(argv) {
        notes.addNote(argv.title, argv.body)
    }

})
//create remove command
yargs.command({
    command: 'remove',
    describe: 'Removing a note.',
    builder: {
        title: {
            describe: 'Title of note you want to delete',
            demandOption: true,
            type: 'string'
        }
    },
    handler(argv) {
        notes.removeNote(argv.title)
    }
})
//create list command
yargs.command({
    command: 'list',
    describe: 'Listing the notes.',
    handler(){
        notes.listNotes();
    }
})
//create read command
yargs.command({
    command: 'read',
    describe: 'Reads the notes.',
    handler() {
        console.log('Reading the notes')
    }
})
//console.log(process.argv)
console.log(yargs.argv)