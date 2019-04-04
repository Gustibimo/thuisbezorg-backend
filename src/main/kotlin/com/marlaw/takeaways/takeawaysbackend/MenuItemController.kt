package com.marlaw.takeaways.takeawaysbackend

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin

class MenuItemController(private val dao: MenuItemDAO) {
    @RequestMapping("/menu-items")
    fun getmenu() = dao.lisMenuItems()
}

