import React, {Component} from 'react';
import '../CSS/Note.css';
import PropTypes from 'prop-types'

class Note extends Component {
    constructor () {
        super();
    }

    render() {
        return (
            <div className="col-sm-6">
                <div className="card card-view">
                    <div className="card-body">
                        <h5 className="card-title">{this.props.title}</h5>
                        <p>{this.props.body}</p>
                        <button className="btn btn-warning">Edit</button>
                        <button className="btn btn-danger">Delete</button>
                    </div>
                </div>
            </div>
        );
    }
}

Note.defaultProps= {
    title: "a cool title",
    body: "a cool body",
};

Note.propTypes = {
    title: PropTypes.string,
};

export default Note;
