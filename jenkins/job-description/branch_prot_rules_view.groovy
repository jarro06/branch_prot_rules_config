 
listView('branch_prot_rules Jobs') {
    description('branch_prot_rules Jobs')
    jobs {
        regex('branch_prot_rules_.+')
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
