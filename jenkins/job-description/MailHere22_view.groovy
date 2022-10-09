 
listView('MailHere22 Jobs') {
    description('MailHere22 Jobs')
    jobs {
        regex('MailHere22_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
