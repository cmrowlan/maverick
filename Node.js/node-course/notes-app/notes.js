const fs = require('fs')
const chalk = require('chalk')

const getNotes = () => {
    return 'Your notes...'
}
const addNote = (title, body) => {
    const notes = loadNotes()

    const duplicateNotes = notes.filter((note) => {
        return note.title === title
    })
    if (duplicateNotes.length === 0) {
        notes.push({
            title: title,
            body: body
        })
        saveNotes(notes)
        console.log(chalk.bgGreen('Note added successfully.'))
    } else{
        console.log(chalk.bgRedBright('Note title already taken!'))
    }
}
const saveNotes = (notes) => {
    const dataJSON = JSON.stringify(notes)
    fs.writeFileSync('notes.json', dataJSON)
}
const loadNotes = () => {
    try { 
    const dataBuffer = fs.readFileSync('notes.json')
    const dataJSON = dataBuffer.toString()
    return JSON.parse(dataJSON)
    } catch (e){
        return []
    }
}
const removeNote = (title) => {
    const notes = loadNotes();
    const removedNote = notes.findIndex((note) => {
        return note.title === title;
    });
    if (removedNote > -1) {
        notes.splice(removedNote, 1);
        saveNotes(notes);
        console.log(chalk.bgGreen('Note was removed!'));
    } else { 
        console.log(chalk.bgRedBright('Note was not found.'));
    }
    console.log(title);
}
const listNotes = () => {
    const notes = loadNotes();
    console.log(chalk.bgCyanBright('Your notes: '))
    notes.forEach(() => {
        console.log(note.title)
    })
}
module.exports = {
    getNotes: getNotes,
    addNote: addNote,
    removeNote: removeNote,
    listNotes: listNotes
}