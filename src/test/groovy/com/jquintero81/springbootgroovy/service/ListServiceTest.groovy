package com.jquintero81.springbootgroovy.service

import spock.lang.Specification

class ListServiceTest extends Specification {
    ListService listService

    void setup() {
        listService = new ListService()
    }

    def "should delete values from list"() {
        given:
        def ids = ['offer-id', 'offer-id-2']
        def emptyList

        when:
        def newList = listService.deleteValuesFromList(ids, emptyList)

        then:
        newList == ['offer-id', 'offer-id-2']
    }
}
