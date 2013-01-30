package com.evolutionnext;

import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 11/13/11
 * Time: 8:53 PM
 */

public class RegisterPlayer {
    private List<Member> members;

    public RegisterPlayer() {
        members = new ArrayList<Member>();
    }

    public void addPlayer(Member member) {
        this.members.add(member);
    }
}
