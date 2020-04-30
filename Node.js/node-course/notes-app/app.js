const chalk = require('chalk')
const yargs = require('yargs')
const noteUtils = require('./notes.js')

yargs.version('1.1.0')


//add, remove, read, list

yargs.command({
    command: 'add',
    describe: 'Add a new note',
    builder: {
        title: {
            describe: 'Note title',
            demandOption: true,
            type: 'string'
        },
        body: {
            describe: 'Note body text',
            demandOption: true,
            type: 'string'
        },
    },
    handler: (argv) => {
        noteUtils.addNote(argv.title, argv.body)
    }
})
//remove command
yargs.command({
    command: 'remove',
    describe: 'Remove a note',
    builder: {
        title: {
            describe: 'Title to be removed',
            demandOption: true,
            type: 'string'
        }
    },
    handler: (argv) => {
        noteUtils.removeNote(argv.title)
    }
})
//list command
yargs.command({
    command: 'list',
    describe: 'List the notes',
    handler: () => {
        noteUtils.listNotes()
    }
})
//read command
yargs.command({
    command: 'read',
    describe: 'Read a note',
    builder: {
        title: {
            describe: 'Title of note you want to read',
            demandOption: true,
            type: 'string'
        }
    },
    handler: (argv) => {
        noteUtils.readNote(argv.title)
    }
})

console.log(yargs.argv)
