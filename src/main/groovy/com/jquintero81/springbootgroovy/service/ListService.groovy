package com.jquintero81.springbootgroovy.service

import lombok.extern.slf4j.Slf4j
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Slf4j
@Service
class ListService {
    def log = LoggerFactory.getLogger(this.getClass())
    def deleteValuesFromList(
            final def listToUpdate,
            final def valuesToDelete
    ) {
        log.info("deleteValuesFromList listToUpdate: $listToUpdate valuesToDelete: $valuesToDelete")
        listToUpdate - valuesToDelete
    }
}
