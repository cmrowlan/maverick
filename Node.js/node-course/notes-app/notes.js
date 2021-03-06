const fs = require('fs')
const chalk = require('chalk')

const getNotes = () => {
    return 'Your Notes...'
}

const addNote = (title, body) => {
    const notes = loadNotes()
    const duplicateNote = notes.find((note) => note.title === title)

    if (!duplicateNote) {
        notes.push({
            title: title,
            body: body
        })
    
        saveNotes(notes)
        console.log(chalk.green.inverse('Note saved!'))
    } else {
        console.log(chalk.red.inverse('Note title already exists'))
    }
    
}

const removeNote = (title) => {
    const notes = loadNotes()
    const notesToKeep = notes.filter((note) => note.title !== title)
    
    if (notesToKeep.length < notes.length) {
        saveNotes(notesToKeep)
        console.log(chalk.bgGreen('Note removed'))
    } else {
        console.log(chalk.bgRed('No note was found'))
    }
}
const saveNotes = (notes) => {
    const dataJSON = JSON.stringify(notes)
    fs.writeFileSync('notes.json', dataJSON)
}

const readNote = (title) => {
    const notes = loadNotes()
    const queryNote = notes.find((note) => note.title === title)
    
    if (queryNote){
        console.log(chalk.bgBlue(queryNote.title))
        console.log(chalk.bgGray(queryNote.body))
    }else{
        console.log(chalk.bgRed('Note not found'))
    }
}

const listNotes = () => {
    const notes = loadNotes()
    console.log(chalk.bgBlue('Your Notes: '))
    notes.forEach((note) => {
        console.log(note.title)
    });
    
}

const loadNotes = () => {
    try {
        const dataBuffer = fs.readFileSync('notes.json')
        const dataJSON = dataBuffer.toString()
        return JSON.parse(dataJSON)
    } catch (e) {
        return []
    }
    
}

module.exports = {
    getNotes: getNotes,
    addNote: addNote,
    removeNote: removeNote,
    listNotes: listNotes,
    readNote: readNote,

}