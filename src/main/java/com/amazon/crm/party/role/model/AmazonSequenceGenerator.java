package com.amazon.crm.party.role.model;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class AmazonSequenceGenerator  implements IdentifierGenerator {

@Override
public Serializable generate(SessionImplementor session, Object object)
        throws HibernateException {

    String prefix = "cli";
    Connection connection = session.connection();

    try {
        Statement statement=connection.createStatement();

        ResultSet rs=statement.executeQuery("select count(id) as Id from PartyRole");

        if(rs.next())
        {
            int id=rs.getInt(1)+101;
            String generatedId = prefix + new Integer(id).toString();
            return generatedId;
        }
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

    return null;
}
}