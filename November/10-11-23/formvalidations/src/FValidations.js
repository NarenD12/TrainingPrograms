import React from "react";
import './FValidation.css';

class FValidations extends React.Component {
    constructor() {
        super();
        this.state = {
            fields: {},
            errors: {}
        }
        this.handleChange = this.handleChange.bind(this);
        this.submituserRegistrationForm = this.submituserRegistrationForm.bind(this);
    };
    submituserRegistrationForm(e) {
        e.preventDefault();
        if (this.validateForm()) {
            alert("Form Submitted Successfully");
        }
    }
    handleChange(e){
        let fields = this.state.fields;
        fields[e.target.name] = e.target.value;
        this.setState({
            fields
          });
    }
    validateForm() {
        let fields = this.state.fields;
        let fvalid = true;
        let errors = {};
        const a=undefined;
        const str= a || '';
        if (!fields["username"]) {
            fvalid = false;
            errors["username"] = "*Please enter your username.";
        }
        if (fields["username"].length<=3 || fields['username'].length==str) {
            fvalid = false;
            errors["username"] = "*Username is Invalid.";
        }
        if (!fields["emailid"]) {
            fvalid = false;
            errors["emailid"] = "*Please enter your email-ID.";
        }
        if (!fields["mobileno"]) {
            fvalid = false;
            errors["mobileno"] = "*Please enter your mobile no.";
        }
        if (!fields["password"]) {
            fvalid = false;
            errors["password"] = "*Please enter your password.";
        }
        this.setState({
            errors:errors
        });
        return fvalid;
    }
    render() {
        return (
            <div id="main-registration-container">
                <div id="register">
                    <form method="post" name="userRegistrationForm" onSubmit={this.submituserRegistrationForm}>
                        <label>Name</label>
                        <input type="text" name="username" value={this.state.fields.username} onChange={this.handleChange} />
                        <div className="errorMsg">{this.state.errors.username}</div>
                        <label>Email ID:</label>
                        <input type="text" name="emailid" value={this.state.fields.emailid} onChange={this.handleChange} />
                        <div className="errorMsg">{this.state.errors.emailid}</div>
                        <label>Mobile No:</label>
                        <input type="text" name="mobileno" value={this.state.fields.mobileno} onChange={this.handleChange} />
                        <div className="errorMsg">{this.state.errors.mobileno}</div>
                        <label>Password</label>
                        <input type="password" name="password" value={this.state.fields.password} onChange={this.handleChange} />
                        <div className="errorMsg">{this.state.errors.password}</div>
                        <input type="submit" className="button" value="Register" />
                    </form>
                </div>
            </div>
        );
    }
}
export default FValidations;